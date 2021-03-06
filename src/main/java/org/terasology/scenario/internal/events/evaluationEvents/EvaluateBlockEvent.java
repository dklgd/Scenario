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
package org.terasology.scenario.internal.events.evaluationEvents;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.Event;
import org.terasology.scenario.internal.systems.ScenarioRootManagementSystem;
import org.terasology.world.block.family.BlockFamily;

/**
 * Event utilized by {@link ScenarioRootManagementSystem} in order to request
 * a value or expression logic entity to be evaluated into a BlockFamily
 */
public class EvaluateBlockEvent implements Event {

    private BlockFamily result;
    private EntityRef passedEntity;

    public EvaluateBlockEvent(EntityRef passed) {
        this.passedEntity = passed;
    }

    public void setResult(BlockFamily result) {
        this.result = result;
    }

    public BlockFamily getResult() {
        return result;
    }

    public void setPassedEntity(EntityRef entity) {
        this.passedEntity = entity;
    }

    public EntityRef getPassedEntity() {
        return passedEntity;
    }
}
