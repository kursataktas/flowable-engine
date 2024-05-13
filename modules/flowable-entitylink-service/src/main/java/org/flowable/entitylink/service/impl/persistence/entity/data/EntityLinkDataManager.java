/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.flowable.entitylink.service.impl.persistence.entity.data;

import java.util.List;

import org.flowable.common.engine.impl.persistence.entity.data.DataManager;
import org.flowable.entitylink.api.EntityLink;
import org.flowable.entitylink.api.InternalEntityLinkQuery;
import org.flowable.entitylink.service.impl.persistence.entity.EntityLinkEntity;

/**
 * @author Tijs Rademakers
 */
public interface EntityLinkDataManager extends DataManager<EntityLinkEntity> {

    List<EntityLink> findEntityLinksWithSameRootScopeForScopeIdAndScopeType(String scopeId, String scopeType, String linkType);

    List<EntityLinkEntity> findEntityLinksByQuery(InternalEntityLinkQuery<EntityLinkEntity> query);

    EntityLinkEntity findEntityLinkByQuery(InternalEntityLinkQuery<EntityLinkEntity> query);

    void deleteEntityLinksByScopeIdAndScopeType(String scopeId, String scopeType);

    void deleteEntityLinksByRootScopeIdAndType(String scopeId, String scopeType);
    
}
