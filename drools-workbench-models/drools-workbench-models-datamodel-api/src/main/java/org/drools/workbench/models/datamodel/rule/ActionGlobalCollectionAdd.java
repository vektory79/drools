/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.workbench.models.datamodel.rule;

/**
 * This is for adding a given fact to a global collection
 */
public class ActionGlobalCollectionAdd implements IAction {

    private String globalName;
    private String factName;

    public ActionGlobalCollectionAdd() {

    }

    public String getGlobalName() {
        return globalName;
    }

    public void setGlobalName( String globalName ) {
        this.globalName = globalName;
    }

    public String getFactName() {
        return factName;
    }

    public void setFactName( String factName ) {
        this.factName = factName;
    }
}
