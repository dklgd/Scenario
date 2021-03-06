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
package org.terasology.scenario.internal.events;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.Event;
import org.terasology.network.OwnerEvent;
import org.terasology.scenario.components.ScenarioRegionVisibilityComponent;

/**
 * Event that is called in order to add a region entity to a player character's {@link ScenarioRegionVisibilityComponent}
 */
@OwnerEvent
public class RegionAddVisibilityEvent implements Event {
    private EntityRef addEntity;

    public RegionAddVisibilityEvent() {}

    public RegionAddVisibilityEvent(EntityRef removalEntity) {
        this.addEntity = removalEntity;
    }

    public EntityRef getAddEntity() {
        return addEntity;
    }
}
