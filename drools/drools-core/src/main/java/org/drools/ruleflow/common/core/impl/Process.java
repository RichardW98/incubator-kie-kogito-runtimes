package org.drools.ruleflow.common.core.impl;/* * Copyright 2005 JBoss Inc *  * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at *  *      http://www.apache.org/licenses/LICENSE-2.0 *  * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */import java.io.Serializable;import org.drools.ruleflow.common.core.IProcess;/** * Default implementation of a Process *  * @author <a href="mailto:kris_verlaenen@hotmail.com">Kris Verlaenen</a> */public class Process implements IProcess, Serializable {
    private static final long serialVersionUID = 3904955335549399096L;        private String id;    private String name;    private String version;
    private String type;        public void setId(String id) {        this.id = id;    }        public String getId() {        return id;    }        public void setName(String name) {        this.name = name;    }        public String getName() {        return name;    }    public void setVersion(String version) {        this.version = version;    }    public String getVersion() {        return version;    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public boolean equals(Object o) {
        if (o instanceof Process) {
            return ((Process) o).getName().equals(name)
                && ((Process) o).getVersion().equals(version);
        }
        return false;
    }
    
    public int hashCode() {
        return name.hashCode() + 3*version.hashCode();
    }}