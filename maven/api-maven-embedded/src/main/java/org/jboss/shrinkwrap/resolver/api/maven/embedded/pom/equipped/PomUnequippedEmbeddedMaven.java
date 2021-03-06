/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.shrinkwrap.resolver.api.maven.embedded.pom.equipped;

import java.io.File;

import org.jboss.shrinkwrap.resolver.api.ResolverSystem;

/**
 * @author <a href="mailto:mjobanek@gmail.com">Matous Jobanek</a>
 */
public interface PomUnequippedEmbeddedMaven extends ResolverSystem {

    /**
     * Creates an instance of EmbeddedMaven with set given POM file.
     *
     * @param pomFile A POM file the EmbeddedMaven should be created with
     * @return A created instance of EmbeddedMaven with set given POM file
     */
    PomEquippedEmbeddedMaven setPom(File pomFile);

}
