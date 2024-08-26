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

package org.flowable.engine.test.bpmn.servicetask;

import java.io.Serializable;

import org.flowable.engine.delegate.BpmnError;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.engine.impl.delegate.TriggerableJavaDelegate;

public class ThrowBpmnErrorTriggerableJavaDelegateServiceTask implements JavaDelegate, TriggerableJavaDelegate, Serializable {

    @Override
    public void execute(DelegateExecution execution) {
    }
    @Override
    public void trigger(Context context) {
        throw new BpmnError("testErrorCode");
    }

}
