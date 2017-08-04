/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.scenario.components.information;

import org.terasology.entitySystem.Component;
import org.terasology.network.Replicate;

/**
 * Value component for a Scenario argument entity, indicates that this argument should use the triggering block entity
 *
 * Argument entities include:
 *   Network Component
 *   Type Component
 *   Value or Expression Component (Values are constant values, expressions are evaluated to obtain the value)
 */
@Replicate
public class ScenarioValueTriggeringBlockComponent implements Component {
}
