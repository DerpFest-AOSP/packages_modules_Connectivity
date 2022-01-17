/*
 * Copyright (C) 2021 The Android Open Source Project
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

package android.nearby;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.annotation.SystemApi;
import android.nearby.aidl.FastPairDiscoveryItemParcel;

/**
 * Class for FastPairDiscoveryItem and its builder.
 *
 * @hide
 */
@SystemApi
public class FastPairDiscoveryItem {

    FastPairDiscoveryItemParcel mMetadataParcel;

    FastPairDiscoveryItem(
            FastPairDiscoveryItemParcel metadataParcel) {
        this.mMetadataParcel = metadataParcel;
    }

    /**
     * Get Id.
     */
    @Nullable
    public String getId() {
        return mMetadataParcel.id;
    }

    /**
     * Get Type.
     */
    public int getType() {
        return mMetadataParcel.type;
    }

    /**
     * Get MacAddress.
     */
    @Nullable
    public String getMacAddress() {
        return mMetadataParcel.macAddress;
    }

    /**
     * Get ActionUrl.
     */
    @Nullable
    public String getActionUrl() {
        return mMetadataParcel.actionUrl;
    }

    /**
     * Get DeviceName.
     */
    @Nullable
    public String getDeviceName() {
        return mMetadataParcel.deviceName;
    }

    /**
     * Get Title.
     */
    @Nullable
    public String getTitle() {
        return mMetadataParcel.title;
    }

    /**
     * Get Description.
     */
    @Nullable
    public String getDescription() {
        return mMetadataParcel.description;
    }

    /**
     * Get DisplayUrl.
     */
    @Nullable
    public String getDisplayUrl() {
        return mMetadataParcel.displayUrl;
    }

    /**
     * Get LastObservationTimestampMillis.
     */
    public long getLastObservationTimestampMillis() {
        return mMetadataParcel.lastObservationTimestampMillis;
    }

    /**
     * Get FirstObservationTimestampMillis.
     */
    public long getFirstObservationTimestampMillis() {
        return mMetadataParcel.firstObservationTimestampMillis;
    }

    /**
     * Get State.
     */
    public int getState() {
        return mMetadataParcel.state;
    }

    /**
     * Get ActionUrlType.
     */
    public int getActionUrlType() {
        return mMetadataParcel.actionUrlType;
    }

    /**
     * Get Rssi.
     */
    public int getRssi() {
        return mMetadataParcel.rssi;
    }

    /**
     * Get PendingAppInstallTimestampMillis.
     */
    public long getPendingAppInstallTimestampMillis() {
        return mMetadataParcel.pendingAppInstallTimestampMillis;
    }

    /**
     * Get TxPower.
     */
    public int getTxPower() {
        return mMetadataParcel.txPower;
    }

    /**
     * Get AppName.
     */
    @Nullable
    public String getAppName() {
        return mMetadataParcel.appName;
    }

    /**
     * Get GroupId.
     */
    @Nullable
    public String getGroupId() {
        return mMetadataParcel.groupId;
    }

    /**
     * Get AttachmentType.
     */
    public int getAttachmentType() {
        return mMetadataParcel.attachmentType;
    }

    /**
     * Get PackageName.
     */
    @Nullable
    public String getPackageName() {
        return mMetadataParcel.packageName;
    }

    /**
     * Get FeatureGraphicUrl.
     */
    @Nullable
    public String getFeatureGraphicUrl() {
        return mMetadataParcel.featureGraphicUrl;
    }

    /**
     * Get TriggerId.
     */
    @Nullable
    public String getTriggerId() {
        return mMetadataParcel.triggerId;
    }

    /**
     * Get IconPng.
     */
    @Nullable
    public byte[] getIconPng() {
        return mMetadataParcel.iconPng;
    }

    /**
     * Get IconFifeUrl.
     */
    @Nullable
    public String getIconFfeUrl() {
        return mMetadataParcel.iconFifeUrl;
    }

    /**
     * Get DebugMessage.
     */
    @Nullable
    public String getDebugMessage() {
        return mMetadataParcel.debugMessage;
    }

    /**
     * Get DebugCategory.
     */
    public int getDebugCategory() {
        return mMetadataParcel.debugCategory;
    }

    /**
     * Get LostMillis.
     */
    public long getLostMillis() {
        return mMetadataParcel.lostMillis;
    }

    /**
     * Get LastUserExperience.
     */
    public int getLastUserExperience() {
        return mMetadataParcel.lastUserExperience;
    }

    /**
     * Get BleRecordBytes.
     */
    @Nullable
    public byte[] getBleRecordBytes() {
        return mMetadataParcel.bleRecordBytes;
    }

    /**
     * Get EntityId.
     */
    @Nullable
    public String getEntityId() {
        return mMetadataParcel.entityId;
    }

    /**
     * Get authenticationPublicKeySecp256r1.
     */
    @Nullable
    public byte[] getAuthenticationPublicKeySecp256r1() {
        return mMetadataParcel.authenticationPublicKeySecp256r1;
    }

    /**
     * Builder used to create FastPairDiscoveryItem.
     */
    public static final class Builder {

        private final FastPairDiscoveryItemParcel mBuilderParcel;

        /**
         * Default constructor of Builder.
         */
        public Builder() {
            mBuilderParcel = new FastPairDiscoveryItemParcel();
        }

        /**
         * Set Id.
         *
         * @param id Unique id.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setId(@Nullable String id) {
            mBuilderParcel.id = id;
            return this;
        }

        /**
         * Set Nearby Type.
         *
         * @param type Nearby type.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setType(int type) {
            mBuilderParcel.type = type;
            return this;
        }

        /**
         * Set MacAddress.
         *
         * @param macAddress Fast Pair device rotating mac address.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setMacAddress(@Nullable String macAddress) {
            mBuilderParcel.macAddress = macAddress;
            return this;
        }

        /**
         * Set ActionUrl.
         *
         * @param actionUrl Action Url of Fast Pair device.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setActionUrl(@Nullable String actionUrl) {
            mBuilderParcel.actionUrl = actionUrl;
            return this;
        }

        /**
         * Set DeviceName.
         * @param deviceName Fast Pair device name.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setDeviceName(@Nullable String deviceName) {
            mBuilderParcel.deviceName = deviceName;
            return this;
        }

        /**
         * Set Title.
         *
         * @param title Title of Fast Pair device.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setTitle(@Nullable String title) {
            mBuilderParcel.title = title;
            return this;
        }

        /**
         * Set Description.
         *
         * @param description Description of Fast Pair device.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setDescription(@Nullable String description) {
            mBuilderParcel.description = description;
            return this;
        }

        /**
         * Set DisplayUrl.
         *
         * @param displayUrl Display Url of Fast Pair device.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setDisplayUrl(@Nullable String displayUrl) {
            mBuilderParcel.displayUrl = displayUrl;
            return this;
        }

        /**
         * Set LastObservationTimestampMillis.
         *
         * @param lastObservationTimestampMillis Last observed timestamp of Fast Pair device, keyed
         *                                       by a rotating id.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setLastObservationTimestampMillis(
                long lastObservationTimestampMillis) {
            mBuilderParcel.lastObservationTimestampMillis = lastObservationTimestampMillis;
            return this;
        }

        /**
         * Set FirstObservationTimestampMillis.
         *
         * @param firstObservationTimestampMillis First observed timestamp of Fast Pair device,
         *                                        keyed by a rotating id.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setFirstObservationTimestampMillis(
                long firstObservationTimestampMillis) {
            mBuilderParcel.firstObservationTimestampMillis = firstObservationTimestampMillis;
            return this;
        }

        /**
         * Set State.
         *
         * @param state Item's current state. e.g. if the item is blocked.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setState(int state) {
            mBuilderParcel.state = state;
            return this;
        }

        /**
         * Set ActionUrlType.
         *
         * @param actionUrlType The resolved url type for the action_url.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setActionUrlType(int actionUrlType) {
            mBuilderParcel.actionUrlType = actionUrlType;
            return this;
        }

        /**
         * Set Rssi.
         *
         * @param rssi Beacon's RSSI value.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setRssi(int rssi) {
            mBuilderParcel.rssi = rssi;
            return this;
        }

        /**
         * Set PendingAppInstallTimestampMillis.
         *
         * @param pendingAppInstallTimestampMillis The timestamp when the user is redirected to App
         *                                         Store after clicking on the item.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setPendingAppInstallTimestampMillis(long pendingAppInstallTimestampMillis) {
            mBuilderParcel.pendingAppInstallTimestampMillis = pendingAppInstallTimestampMillis;
            return this;
        }

        /**
         * Set TxPower.
         *
         * @param txPower Beacon's tx power.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setTxPower(int txPower) {
            mBuilderParcel.txPower = txPower;
            return this;
        }

        /**
         * Set AppName.
         *
         * @param appName Human readable name of the app designated to open the uri.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setAppName(@Nullable String appName) {
            mBuilderParcel.appName = appName;
            return this;
        }

        /**
         * Set GroupId.
         *
         * @param groupId ID used for associating several DiscoveryItems. These items may be
         *                visually displayed together.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setGroupId(@Nullable String groupId) {
            mBuilderParcel.groupId = groupId;
            return this;
        }

        /**
         * Set AttachmentType.
         *
         * @param attachmentType Whether the attachment is created in debug namespace.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setAttachmentType(int attachmentType) {
            mBuilderParcel.attachmentType = attachmentType;
            return this;
        }

        /**
         * Set PackageName.
         *
         * @param packageName Package name of the App that owns this item.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setPackageName(@Nullable String packageName) {
            mBuilderParcel.packageName = packageName;
            return this;
        }

        /**
         * Set FeatureGraphicUrl.
         *
         * @param featureGraphicUrl The "feature" graphic image url used for large sized list view
         *                          entries.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setFeatureGraphicUrl(@Nullable String featureGraphicUrl) {
            mBuilderParcel.featureGraphicUrl = featureGraphicUrl;
            return this;
        }

        /**
         * Set TriggerId.
         *
         * @param triggerId TriggerId identifies the trigger/beacon that is attached with a message.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setTriggerId(@Nullable String triggerId) {
            mBuilderParcel.triggerId = triggerId;
            return this;
        }

        /**
         * Set IconPng.
         *
         * @param iconPng Bytes of item icon in PNG format displayed in Discovery item list.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setIconPng(@Nullable byte[] iconPng) {
            mBuilderParcel.iconPng = iconPng;
            return this;
        }

        /**
         * Set IconFifeUrl.
         *
         * @param iconFifeUrl A FIFE URL of the item icon displayed in Discovery item list.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setIconFfeUrl(@Nullable String iconFifeUrl) {
            mBuilderParcel.iconFifeUrl = iconFifeUrl;
            return this;
        }

        /**
         * Set DebugMessage.
         *
         * @param debugMessage Message written to bugreport for 3P developers.(No sensitive info)
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setDebugMessage(@Nullable String debugMessage) {
            mBuilderParcel.debugMessage = debugMessage;
            return this;
        }

        /**
         * Set DebugCategory.
         *
         * @param debugCategory Weather the item is filtered out on server.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setDebugCategory(int debugCategory) {
            mBuilderParcel.debugCategory = debugCategory;
            return this;
        }

        /**
         * Set LostMillis.
         *
         * @param lostMillis Client timestamp when the trigger (e.g. beacon) was last lost
         *                   (e.g. when Messages told us the beacon's no longer nearby).
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setLostMillis(long lostMillis) {
            mBuilderParcel.lostMillis = lostMillis;
            return this;
        }

        /**
         * Set LastUserExperience.
         *
         * @param lastUserExperience The kind of experience the user last had with this (e.g. if
         *                           they dismissed the notification, that's bad; but if they tapped
         *                           it, that's good).
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setLastUserExperience(int lastUserExperience) {
            mBuilderParcel.lastUserExperience = lastUserExperience;
            return this;
        }

        /**
         * Set BleRecordBytes.
         *
         * @param bleRecordBytes The most recent BLE advertisement related to this item.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setBleRecordBytes(@Nullable byte[] bleRecordBytes) {
            mBuilderParcel.bleRecordBytes = bleRecordBytes;
            return this;
        }

        /**
         * Set EntityId.
         *
         * @param entityId An ID generated on the server to uniquely identify content.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setEntityId(@Nullable String entityId) {
            mBuilderParcel.entityId = entityId;
            return this;
        }

        /**
         * Set authenticationPublicKeySecp256r1.
         *
         * @param authenticationPublicKeySecp256r1 Fast Pair device public key.
         * @return The builder, to facilitate chaining {@code builder.setXXX(..).setXXX(..)}.
         */
        @NonNull
        public Builder setAuthenticationPublicKeySecp256r1(
                @Nullable byte[] authenticationPublicKeySecp256r1) {
            mBuilderParcel.authenticationPublicKeySecp256r1 = authenticationPublicKeySecp256r1;
            return this;
        }

        /**
         * Build {@link FastPairDiscoveryItem} with the currently set configuration.
         */
        @NonNull
        public FastPairDiscoveryItem build() {
            return new FastPairDiscoveryItem(mBuilderParcel);
        }
    }
}
