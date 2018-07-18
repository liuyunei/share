<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<div id="updateDialog" class="crudDialog">
	<form id="updateForm" method="post">
		<input type="hidden" name="bikeid" value="1">
		<div class="row">
            <div class="col-sm-2">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="bikeid">车辆编号</label>
                        <input id="bikeid" type="text" class="form-control" name="bikeid" maxlength="50" readonly value="${bikebasicinfo.bikeid}">
                    </div>
                </div>
            </div>
            <div class="col-sm-2">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="companyid">所属企业</label>
                        <input id="companyid" type="text" class="form-control" name="companyid" value="${bikebasicinfo.companyid}">
                    </div>
                </div>
            </div>
			<div class="col-sm-2">
				<div class="form-group">
					<div class="fg-line">
						<label for="staticlongitude">物理经度</label>
						<input id="staticlongitude" type="text" class="form-control" name="staticlongitude" maxlength="300" value="${bikebasicinfo.staticlongitude}">
					</div>
				</div>
			</div>
			<div class="col-sm-2">
				<div class="form-group">
					<div class="fg-line">
						<label for="staticlatitude">物理维度</label>
						<input id="staticlatitude" type="text" class="form-control" name="staticlatitude" maxlength="100" value="${bikebasicinfo.staticlatitude}">
					</div>
				</div>
			</div>
            <div class="col-sm-12">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="configeinfo">附属部件信息</label>
                        <input id="configeinfo" type="text" class="form-control" name="configeinfo" maxlength="20" value="${bikebasicinfo.configeinfo}">
                    </div>
                </div>
            </div>
		<div class="form-group text-right dialog-buttons">
			<a class="waves-effect waves-button" href="javascript:;" onclick="updateSubmit();">保存</a>
			<a class="waves-effect waves-button" href="javascript:;" onclick="updateDialog.close();">取消</a>
		</div>
        </div>
	</form>
</div>
<script>
function updateSubmit() {
    $.ajax({
        type: 'post',
        url: '${basePath}/manage/bikebasicinfo/update/${bikebasicinfo.bikeid}',
        data: $('#updateForm').serialize(),
        beforeSend: function() {
			if ($('#title').val() == '') {
				$('#title').focus();
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
							title: false,
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
							title: false,
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
				updateDialog.close();
				$table.bootstrapTable('refresh');
			}
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
			$.confirm({
				theme: 'dark',
				animation: 'rotateX',
				closeAnimation: 'rotateX',
				title: false,
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