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
package com.intuit.wasabi.assignmentobjects;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.intuit.hyrule.Rule;
import com.intuit.wasabi.experimentobjects.Experiment;

public class RuleCache {

    // FIXME cache can only grow, we need to add a delete routine that removes rule objects for terminated/deleted experiments

    // Default 16 standard concurrency update level used
    private Map<Experiment.ID, Rule> ruleCache = new ConcurrentHashMap<>();

    public void setRule(Experiment.ID key, Rule rule) {
      ruleCache.put(key, rule);
    }

    public Rule getRule(Experiment.ID key) {
        return ruleCache.get(key);
    }

    public boolean containsRule(Experiment.ID key) {
        return ruleCache.containsKey(key);
    }

    public void clearRule(Experiment.ID key) { ruleCache.remove(key);}
}
