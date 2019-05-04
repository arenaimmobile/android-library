package com.urbanairship.push;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;

/**
 * Registration listener.
 */
public interface RegistrationListener {

    /**
     * Called when a channel ID is created.
     *
     * @param channelId The channel ID.
     */
    @WorkerThread
    void onChannelCreated(@NonNull String channelId);

    /**
     * Called when a token is updated.
     *
     * @param token The push token.
     */
    @WorkerThread
    void onPushTokenUpdated(@NonNull String token);
}