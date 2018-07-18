<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<div id="createDialog" class="crudDialog">
	<form id="createForm" method="post">
		<%--<input type="hidden" name="userId" value="1">--%>
		<div class="row">
			<div class="col-sm-2">
				<div class="form-group">
					<div class="fg-line">
						<label for="bikeid">车辆编号</label>
						<input id="bikeid" type="text" class="form-control" name="bikeid" maxlength="50">
					</div>
				</div>
			</div>
            <div class="col-sm-2">
                <div class="form-group">
                    <div class="fg-line">
                        <select id="topicId" name="topicId" style="width: 100%">
                            <option value="0">所属企业</option>
                            <c:forEach var="cmsTopic" items="${cmsTopics}">
                                <option value="${cmsTopic.topicId}">${cmsTopic.title}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
            </div>
			<div class="col-sm-2">
				<div class="form-group">
					<div class="fg-line">
						<label for="deliverytime">投放时间</label>
						<input id="deliverytime" type="text" class="form-control" name="delivertime" maxlength="500">
					</div>
				</div>
			</div>
			<div class="col-sm-2">
				<div class="form-group">
					<div class="fg-line">
						<label for="staticlongitude">静态经度</label>
						<input id="staticlongitude" type="text" class="form-control" name="staticlongitude" maxlength="150">
					</div>
				</div>
			</div>
			<div class="col-sm-2">
				<div class="form-group">
					<div class="fg-line">
						<label for="staticlatitude">静态维度</label>
						<input id="staticlatitude" type="text" class="form-control" name="staticlatitude" maxlength="150">
					</div>
				</div>
			</div>
            <div class="col-sm-12">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="configeinfo">其他部件信息</label>
                        <input id="configeinfo" type="text" class="form-control" name="configeinfo">
                    </div>
                </div>
            </div>

		</div>
		<div class="form-group text-right dialog-buttons">
			<a class="waves-effect waves-button" href="javascript:;" onclick="createSubmit();">保存</a>
			<a class="waves-effect waves-button" href="javascript:;" onclick="createDialog.close();">取消</a>
		</div>
	</form>
</div>
<script>
function createSubmit() {
    $.ajax({
        type: 'post',
        url: '${basePath}/manage/bikebasicinfo/create',
        data: $('#createForm').serialize(),
        beforeSend: function() {
            if ($('#bikeid').val() == '') {
                $('#bikeid').focus();
                return false;
            }
        },
        success: function(result) {
			if (result.code != 1) {
				if (result.data instanceof Array) {
					$.each(result.data, function(index, value) {
						$.confirm({
							theme: 'dark',
							animation: 'rotateX',
							closeAnimation: 'rotateX',
							bikeid: false,
							content: value.errorMsg,
							buttons: {
								confirm: {
									text: '确认',
									btnClass: 'waves-effect waves-button waves-light'
								}
							}
						});
					});
				} else {
						$.confirm({
							theme: 'dark',
							animation: 'rotateX',
							closeAnimation: 'rotateX',
							bikeid: false,
							content: result.data.errorMsg,
							buttons: {
								confirm: {
									text: '确认',
									btnClass: 'waves-effect waves-button waves-light'
								}
							}
						});
				}
			} else {
				createDialog.close();
				$table.bootstrapTable('refresh');
			}
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
			$.confirm({
				theme: 'dark',
				animation: 'rotateX',
				closeAnimation: 'rotateX',
				bikeid: false,
				content: textStatus,
				buttons: {
					confirm: {
						text: '确认',
						btnClass: 'waves-effect waves-button waves-light'
					}
				}
			});
        }
    });
}
</script>