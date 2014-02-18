//
// This file is part of the Fuel Java SDK.
//
// Copyright (C) 2013, 2014 ExactTarget, Inc.
// All rights reserved.
//
// Permission is hereby granted, free of charge, to any person
// obtaining a copy of this software and associated documentation
// files (the "Software"), to deal in the Software without restriction,
// including without limitation the rights to use, copy, modify,
// merge, publish, distribute, sublicense, and/or sell copies
// of the Software, and to permit persons to whom the Software
// is furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY
// KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
// OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES
// OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
// OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH
// THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//

package com.exacttarget.fuelsdk.soap;

import java.util.List;

import com.exacttarget.fuelsdk.ETClient;
import com.exacttarget.fuelsdk.ETListService;
import com.exacttarget.fuelsdk.ETSdkException;
import com.exacttarget.fuelsdk.ETResponse;
import com.exacttarget.fuelsdk.filter.ETFilter;
import com.exacttarget.fuelsdk.model.ETList;

public class ETListServiceImpl extends ETCrudServiceImpl<ETList>
    implements ETListService
{
    public ETResponse<ETList> get(ETClient client)
        throws ETSdkException
    {
        return super.get(client, ETList.class);
    }

	public ETResponse<ETList> get(ETClient client, ETFilter filter)
			throws ETSdkException {
		return super.get(client, ETList.class, filter);
	}

	public ETResponse<ETList> post(ETClient client, ETList list)
			throws ETSdkException {
		return super.post(client, list);
	}

	public ETResponse<ETList> patch(ETClient client, ETList list)
			throws ETSdkException {
		return super.patch(client, list);
	}

	public ETResponse<ETList> delete(ETClient client, ETList list)
			throws ETSdkException {
		return super.delete(client, list);
	}

	public ETResponse<ETList> post(ETClient client, List<ETList> lists)
			throws ETSdkException {
		return super.post(client, lists);
	}

	public ETResponse<ETList> patch(ETClient client, List<ETList> lists)
			throws ETSdkException {
		return super.patch(client, lists);
	}

	public ETResponse<ETList> delete(ETClient client, List<ETList> lists)
			throws ETSdkException {
		return super.delete(client, lists);
	}
}
