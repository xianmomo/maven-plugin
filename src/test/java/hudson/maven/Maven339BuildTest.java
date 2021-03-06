package hudson.maven;

/*
 * Olivier Lamy
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

import hudson.tasks.Maven;
import hudson.tasks.Maven.MavenInstallation;
import org.junit.Ignore;
import org.jvnet.hudson.test.ToolInstallations;

/**
 * @author Oleg Nenashev
 */
//TODO: Placeholder for Maven 3.3.9 tests. Inactive, because JTH test tools do not offer such version of Maven
// Another tool installation approach should be used
@Ignore
public class Maven339BuildTest
    extends AbstractMaven3xBuildTest {

    @Override
    public MavenInstallation configureMaven3x()
        throws Exception
    {
        MavenInstallation mvn = ToolInstallations.configureDefaultMaven("apache-maven-3.3.9", MavenInstallation.MAVEN_30);
        MavenInstallation m3 = new MavenInstallation("apache-maven-3.3.9", mvn.getHome(), j.NO_PROPERTIES);
        j.jenkins.getDescriptorByType(Maven.DescriptorImpl.class).setInstallations(m3);
        return m3;
    }
}
