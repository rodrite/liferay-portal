/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.service;

/**
 * <a href="RoleServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class RoleServiceUtil {
	public static com.liferay.portal.model.Role addRole(java.lang.String name,
		int type)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException, java.rmi.RemoteException {
		RoleService roleService = RoleServiceFactory.getService();

		return roleService.addRole(name, type);
	}

	public static void deleteRole(java.lang.String roleId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException, java.rmi.RemoteException {
		RoleService roleService = RoleServiceFactory.getService();
		roleService.deleteRole(roleId);
	}

	public static com.liferay.portal.model.Role getGroupRole(
		java.lang.String companyId, long groupId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException, java.rmi.RemoteException {
		RoleService roleService = RoleServiceFactory.getService();

		return roleService.getGroupRole(companyId, groupId);
	}

	public static com.liferay.portal.model.Role getRole(java.lang.String roleId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException, java.rmi.RemoteException {
		RoleService roleService = RoleServiceFactory.getService();

		return roleService.getRole(roleId);
	}

	public static com.liferay.portal.model.Role getRole(
		java.lang.String companyId, java.lang.String name)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException, java.rmi.RemoteException {
		RoleService roleService = RoleServiceFactory.getService();

		return roleService.getRole(companyId, name);
	}

	public static java.util.List getRolePermissions(java.lang.String roleId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException, java.rmi.RemoteException {
		RoleService roleService = RoleServiceFactory.getService();

		return roleService.getRolePermissions(roleId);
	}

	public static java.util.List getUserGroupRoles(java.lang.String userId,
		long groupId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException, java.rmi.RemoteException {
		RoleService roleService = RoleServiceFactory.getService();

		return roleService.getUserGroupRoles(userId, groupId);
	}

	public static java.util.List getUserRelatedRoles(java.lang.String userId,
		java.util.List groups)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException, java.rmi.RemoteException {
		RoleService roleService = RoleServiceFactory.getService();

		return roleService.getUserRelatedRoles(userId, groups);
	}

	public static java.util.List getUserRoles(java.lang.String userId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException, java.rmi.RemoteException {
		RoleService roleService = RoleServiceFactory.getService();

		return roleService.getUserRoles(userId);
	}

	public static com.liferay.portal.model.Role updateRole(
		java.lang.String roleId, java.lang.String name)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException, java.rmi.RemoteException {
		RoleService roleService = RoleServiceFactory.getService();

		return roleService.updateRole(roleId, name);
	}
}