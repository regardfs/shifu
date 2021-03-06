package ml.shifu.shifu.util.updater;

import ml.shifu.shifu.container.obj.ColumnConfig;
import ml.shifu.shifu.container.obj.ModelConfig;
import ml.shifu.shifu.core.validator.ModelInspector;

import java.io.IOException;
import java.util.List;

/**
 * Created by zhanhu on 2/22/17.
 */
public class ColumnConfigUpdater {

    /**
     * Update target, listMeta, listForceSelect, listForceRemove
     * @param modelConfig - ModelConfig
     * @param columnConfigList - ColumnConfig list to update
     * @param step - which step is running
     * @throws IOException - error occur, when create updater
     */
    public static void updateColumnConfigFlags(ModelConfig modelConfig, List<ColumnConfig> columnConfigList,
            ModelInspector.ModelStep step) throws IOException {
        BasicUpdater updater = BasicUpdater.getUpdater(modelConfig, step);
        for(ColumnConfig config: columnConfigList) {
           updater.updateColumnConfig(config);
        }
    }

}
