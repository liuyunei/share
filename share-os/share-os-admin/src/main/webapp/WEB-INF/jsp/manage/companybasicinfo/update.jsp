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
		<div class="form-group">
			<label for="compayname">企业名称</label>
			<input id="compayname" type="text" class="form-control" name="compayname" maxlength="20" value="${companybasicinfo.compayname}">
		</div>
		<div class="form-group">
			<label for="registeredcapital">注册资本</label>
			<input id="registeredcapital" type="text" class="form-control" name="registeredcapital" maxlength="200" value="${companybasicinfo.registeredcapital}">
		</div>
		<div class="form-group">
			<label for="businessregistrationnumber">工商注册号</label>
			<input id="businessregistrationnumber" type="text" class="form-control" name="businessregistrationnumber" value="${companybasicinfo.businessregistrationnumber}">
		</div>
		<div class="form-group">
			<label for="registrationtime">注册时间</label>
			<input id="registrationtime" type="text" class="form-control" name="registrationtime" value="${companybasicinfo.registrationtime}">
		</div>

		<div class="form-group">
			<label for="businessoperationstatus">企业运营状态</label>
			<input id="businessoperationstatus" type="text" class="form-control" name="url" value="${companybasicinfo.businessoperationstatus}">
		</div>

		<div class="form-group">
			<label for="organizationcodej">组织机构代码</label>
			<input id="organizationcodej" type="text" class="form-control" name="organizationcodej" value="${companybasicinfo.organizationcodej}">
		</div>
		<div class="form-group">
			<label for="unifiedcreditcode">统一信用代码</label>
			<input id="unifiedcreditcode" type="text" class="form-control" name="unifiedcreditcode" value="${companybasicinfo.unifiedcreditcode}">
		</div>

		<div class="form-group">
			<label for="businessexecutives">企业高管</label>
			<input id="businessexecutives" type="text" class="form-control" name="businessexecutives" value="${companybasicinfo.businessexecutives}">
		</div>
		<div class="form-group">
			<label for="cityoperationmanager">城市运营负责人</label>
			<input id="cityoperationmanager" type="text" class="form-control" name="cityoperationmanager" value="${companybasicinfo.cityoperationmanager}">
		</div>
		<div class="form-group">
			<label for="contactnumber">联系电话</label>
			<input id="contactnumber" type="tel" class="form-control" name="contactnumber" value="${companybasicinfo.contactnumber}">
		</div>
		<div class="form-group">
			<label for="email">企业邮箱</label>
			<input id="email" type="email" class="form-control" name="email" value="${companybasicinfo.email}">
		</div>

		<div class="form-group text-right dialog-buttons">
			<a class="waves-effect waves-button" href="javascript:;" onclick="createSubmit();">保存</a>
			<a class="waves-effect waves-button" href="javascript:;" onclick="updateDialog.close();">取消</a>
		</div>
	</form>
</div>
<script>
	function createSubmit() {
		$.ajax({
			type: 'post',
			url: '${basePath}/manage/companybasicinfo/update/${companybasicinfo.companyid}',
			data: $('#updateForm').serialize(),
			beforeSend: function() {
				if ($('#name').val() == '') {
					$('#name').focus();
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