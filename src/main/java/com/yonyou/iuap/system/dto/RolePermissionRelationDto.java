package com.yonyou.iuap.system.dto;

public class RolePermissionRelationDto {

	private Long roleId;
	
	private Long[] permissionIds;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long[] getPermissionIds() {
		return permissionIds;
	}

	public void setPermissionIds(Long[] permissionIds) {
		this.permissionIds = permissionIds;
	}
	
	
	
}