/*
 * Copyright 2021 Apache All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package com.jameszow.thread.synchronization.test;

import com.jameszow.thread.synchronization.StopThread;

/**
 * This class is used to test concurrent thread operations
 * 此类用于测试并发线程操作
 */
public class StopThreadTest {

    public static void main(String [] args) throws InterruptedException {
        // StopThread.StopThreadTest.forRunThread();
        // StopThread.StopThreadTest2.synchronizedThread();
        StopThread.volatileThreadTest.volatileThread();
        StopThread.volatileThreadTest.printNum();
    }
}
