/*******************************************************************************
 * Copyright 2016 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.intuit.wasabi.eventlog.events;

import com.intuit.wasabi.experimentobjects.Bucket;

/**
 * An interface denoting events related to buckets.
 */
public interface BucketEvent extends ExperimentEvent {

    /**
     * The affected bucket.
     *
     * @return the bucket
     */
    Bucket getBucket();
}
