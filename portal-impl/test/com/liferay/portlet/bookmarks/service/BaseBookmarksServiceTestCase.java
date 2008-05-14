/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.bookmarks.service;

import com.liferay.portal.service.BaseServiceTestCase;
import com.liferay.portal.util.TestPropsValues;
import com.liferay.portlet.bookmarks.model.BookmarksEntry;
import com.liferay.portlet.bookmarks.model.BookmarksFolder;
import com.liferay.portlet.bookmarks.model.impl.BookmarksFolderImpl;
import com.liferay.portlet.bookmarks.service.BookmarksFolderServiceUtil;

/**
 * <a href="BaseBookmarksServiceTestCase.java.html"><b><i>View Source</i></b>
 * </a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class BaseBookmarksServiceTestCase extends BaseServiceTestCase {

	protected BookmarksEntry addEntry() throws Exception {
		BookmarksFolder folder = addFolder();

		String name = "Test Entry";
		String url = "http://www.liferay.com";
		String comments = "This is a test entry.";
		String[] tagsEntries = new String[0];

		boolean addGommunityPermissions = true;
		boolean addGuestPermissions = true;

		return BookmarksEntryServiceUtil.addEntry(
			folder.getFolderId(), name, url, comments, tagsEntries,
			addGommunityPermissions, addGuestPermissions);
	}

	protected BookmarksFolder addFolder() throws Exception {
		long parentFolderId = BookmarksFolderImpl.DEFAULT_PARENT_FOLDER_ID;

		return addFolder(parentFolderId);
	}

	protected BookmarksFolder addFolder(long parentFolderId) throws Exception {
		long plid = TestPropsValues.LAYOUT_PLID;
		String name = "Test Folder";
		String description = "This is a test folder.";

		boolean addGommunityPermissions = true;
		boolean addGuestPermissions = true;

		return BookmarksFolderServiceUtil.addFolder(
			plid, parentFolderId, name, description, addGommunityPermissions,
			addGuestPermissions);
	}

}