package com.wixpress.app.dao;

import java.util.UUID;

/**
 * Created by : doron
 * Since: 7/1/12
 */

public interface SampleAppDao {

    public AppSettings saveAppSettings(AppSettings appSettings, UUID instanceId);

    public AppSettings getAppSettings(UUID instanceId);

    public void updateAppSettings(AppSettings appInstance, UUID instanceId);

}
