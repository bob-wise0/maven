/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.model.version;

import org.apache.maven.api.Version;
import org.apache.maven.api.VersionRange;
import org.apache.maven.api.annotations.Nonnull;
import org.apache.maven.api.services.VersionParserException;

/**
 * Model builder specific version parser. It is intentionally not
 * {@link org.apache.maven.api.services.VersionParser} as this is not a service,
 * but at Maven runtime it MAY actually use that service.
 *
 * @since 4.0.0
 */
public interface VersionParser {

    /**
     * Parses the specified version string, for example "1.0".
     *
     * @param version the version string to parse, must not be {@code null}
     * @return the parsed version, never {@code null}
     * @throws VersionParserException if the string violates the syntax rules of this scheme
     */
    @Nonnull
    Version parseVersion(@Nonnull String version);

    /**
     * Parses the specified version range specification, for example "[1.0,2.0)".
     *
     * @param range the range specification to parse, must not be {@code null}
     * @return the parsed version range, never {@code null}
     * @throws VersionParserException if the range specification violates the syntax rules of this scheme
     */
    @Nonnull
    VersionRange parseVersionRange(@Nonnull String range);
}
