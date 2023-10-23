/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.struts2.util;

import junit.framework.TestCase;


/**
 */
public class CounterTest extends TestCase {

    Counter c = new Counter();


    public void testCurrentAfterNext() {
        long next = c.getNext();
        long current = c.getCurrent();
        assertEquals(next + 1, current);
    }

    public void testCurrentBeforeNext() {
        long current = c.getCurrent();
        long next = c.getNext();
        assertEquals(current, next);
    }

    public void testWrap() {
        c.setWrap(true);
        c.setLast(1);

        long a = c.getNext();
        long b = c.getNext();
        assertEquals(1, a);
        assertEquals(1, b);
    }
}
