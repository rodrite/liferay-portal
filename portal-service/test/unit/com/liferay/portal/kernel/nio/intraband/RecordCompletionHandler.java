/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.nio.intraband;

import java.io.IOException;

import java.util.concurrent.CountDownLatch;

/**
 * @author Shuyang Zhou
 */
public class RecordCompletionHandler<A> implements CompletionHandler<A> {

	public void delivered(A attachment) {
		_attachment = attachment;

		_deliveredCountDownLatch.countDown();
	}

	public void failed(A attachment, IOException ioe) {
		_attachment = attachment;
		_ioe = ioe;

		_failedCountDownLatch.countDown();
	}

	public A getAttachment() {
		return _attachment;
	}

	public IOException getIOException() {
		return _ioe;
	}

	public void replied(A attachment, Datagram datagram) {
		_attachment = attachment;

		_repliedCountDownLatch.countDown();
	}

	public void submitted(A attachment) {
		_attachment = attachment;

		_submittedCountDownLatch.countDown();
	}

	public void timeouted(A attachment) {
		_attachment = attachment;

		_timeoutedCountDownLatch.countDown();
	}

	public void waitUntilDelivered() throws InterruptedException {
		_deliveredCountDownLatch.await();
	}

	public void waitUntilFailed() throws InterruptedException {
		_failedCountDownLatch.await();
	}

	public void waitUntilReplied() throws InterruptedException {
		_repliedCountDownLatch.await();
	}

	public void waitUntilSubmitted() throws InterruptedException {
		_submittedCountDownLatch.await();
	}

	public void waitUntilTimeouted() throws InterruptedException {
		_timeoutedCountDownLatch.await();
	}

	private volatile A _attachment;
	private final CountDownLatch _deliveredCountDownLatch = new CountDownLatch(
		1);
	private final CountDownLatch _failedCountDownLatch = new CountDownLatch(1);
	private volatile IOException _ioe;
	private final CountDownLatch _repliedCountDownLatch = new CountDownLatch(1);
	private final CountDownLatch _submittedCountDownLatch = new CountDownLatch(
		1);
	private final CountDownLatch _timeoutedCountDownLatch = new CountDownLatch(
		1);

}