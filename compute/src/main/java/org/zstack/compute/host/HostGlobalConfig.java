package org.zstack.compute.host;

import org.zstack.core.config.GlobalConfig;
import org.zstack.core.config.GlobalConfigDefinition;
import org.zstack.core.config.GlobalConfigValidation;

/**
 */
@GlobalConfigDefinition
public class HostGlobalConfig {
    public static final String CATEGORY = "host";

    @GlobalConfigValidation
    public static GlobalConfig SIMULTANEOUSLY_LOAD = new GlobalConfig(CATEGORY, "load.all");
    @GlobalConfigValidation
    public static GlobalConfig AUTO_RECONNECT_ON_ERROR = new GlobalConfig(CATEGORY, "connection.autoReconnectOnError");
    @GlobalConfigValidation(numberGreaterThan = 0)
    public static GlobalConfig HOST_LOAD_PARALLELISM_DEGREE = new GlobalConfig(CATEGORY, "load.parallelismDegree");
    @GlobalConfigValidation(numberGreaterThan = 0)
    public static GlobalConfig HOST_TRACK_PARALLELISM_DEGREE = new GlobalConfig(CATEGORY, "ping.parallelismDegree");
    @GlobalConfigValidation(numberGreaterThan = 1)
    public static GlobalConfig PING_HOST_INTERVAL = new GlobalConfig(CATEGORY, "ping.interval");
    @GlobalConfigValidation(numberGreaterThan = 1)
    public static GlobalConfig PING_HOST_TIMEOUT = new GlobalConfig(CATEGORY, "ping.timeout");
    @GlobalConfigValidation(numberGreaterThan = 0)
    public static GlobalConfig MAXIMUM_PING_FAILURE = new GlobalConfig(CATEGORY, "ping.maxFailure");
    @GlobalConfigValidation
    public static GlobalConfig IGNORE_ERROR_ON_MAINTENANCE_MODE = new GlobalConfig(CATEGORY, "maintenanceMode.ignoreError");
    @GlobalConfigValidation(numberGreaterThan = 1, numberLessThan = 1000)
    public static GlobalConfig HOST_CPU_OVER_PROVISIONING_RATIO = new GlobalConfig(CATEGORY, "cpu.overProvisioning.ratio");
    @GlobalConfigValidation
    public static GlobalConfig RECONNECT_ALL_ON_BOOT = new GlobalConfig(CATEGORY, "reconnectAllOnBoot");
    @GlobalConfigValidation
    public static GlobalConfig HOST_UPDATE_OS_PARALLELISM_DEGREE = new GlobalConfig(CATEGORY, "update.os.parallelismDegree");
}
