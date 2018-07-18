<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<div id="updateDialog" class="crudDialog">
	<form id="createForm" method="post">
		<div class="form-group">
			<label for="electronicfenceid">编号</label>
			<input id="electronicfenceid" type="text" class="form-control" name="electronicfenceid"  value="${imElectronicfencedata.electronicfenceid}" readonly maxlength="20">
		</div>
		<div class="form-group">
			<label for="electronicfencename">名称</label>
			<input id="electronicfencename" type="text" class="form-control" name="electronicfencename" value="${imElectronicfencedata.electronicfencename}" maxlength="32">
		</div>
		<div class="form-group">
			<label for="location">位置</label>
			<input value="${imElectronicfencedata.location}" id="location" type="text" class="form-control" name="location" maxlength="20">
		</div>
		<div class="form-group">
			<label for="area">面积(平方米)</label>
			<input value="${imElectronicfencedata.area}" id="area" type="text" class="form-control" name="area" maxlength="20">
		</div>

		<div class="form-group">
			<label for="standardparkingnumber">标准停车位数量</label>
			<input value="${imElectronicfencedata.standardparkingnumber}" id="standardparkingnumber" type="text" class="form-control" name="standardparkingnumber" maxlength="10">
		</div>

		<div class="form-group">
			<label for="coordinate">坐标</label>
			<input value="${imElectronicfencedata.coordinate}" id="coordinate" type="text" class="form-control" name="coordinate" maxlength="20">
		</div>
		<div class="form-group">
			<select id="electronicfenceclassificationid" name="electronicfenceclassificationid" class="form-control">
				<option value="0">请选择分类</option>
				<c:forEach var="classification" items="${classifications}">
					<c:if test="${classification.electronicfenceclassificationid == imElectronicfencedata.electronicfenceclassificationid}">
						<option selected value="${classification.electronicfenceclassificationid}">${classification.electronicfenceclassificationname}</option>
					</c:if>
					<option value="${classification.electronicfenceclassificationid}">${classification.electronicfenceclassificationname}</option>
				</c:forEach>
			</select>
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
        url: '${basePath}/manage/electronicFence/basicInfo/update/${imElectronicfencedata.electronicfenceid}',
        data: $('#updateForm').serialize(),
        beforeSend: function() {
            if ($('#electronicfenceid').val() == '') {
                $('#electronicfenceid').focus();
                return false;
            }

            if ($('#electronicfencename').val() == '') {
                $('#electronicfencename').focus();
                return false;
            }

            if ($('#location').val() == '') {
                $('#location').focus();
                return false;
            }

            if ($('#area').val() == '') {
                $('#area').focus();
                return false;
            }

            if ($('#standardparkingnumber').val() == '') {
                $('#standardparkingnumber').focus();
                return false;
            }

            if ($('#coordinate').val() == '') {
                $('#coordinate').focus();
                return false;
            }

            if ($('#electronicfenceclassificationid').val() == "0"){
                alert("请选择分类");
                $('#electronicfenceclassificationid').focus();
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