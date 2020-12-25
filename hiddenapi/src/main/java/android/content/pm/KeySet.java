/*
 * Copyright (C) 2012 The Android Open Source Project
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

package android.content.pm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Represents a {@code KeySet} that has been declared in the AndroidManifest.xml
 * file for the application.  A {@code KeySet} can be used explicitly to
 * represent a trust relationship with other applications on the device.
 */
public class KeySet implements Parcelable {
    public KeySet(IBinder token) {
        throw new UnsupportedOperationException();
    }

    public IBinder getToken() {
        throw new UnsupportedOperationException();
    }

    public static final Parcelable.Creator<KeySet> CREATOR = new Parcelable.Creator<KeySet>() {
        /**
         * Create a KeySet from a Parcel
         *
         * @param in The parcel containing the KeySet
         */
        public KeySet createFromParcel(Parcel in) {
            return readFromParcel(in);
        }

        /**
         * Create an array of null KeySets
         */
        public KeySet[] newArray(int size) {
            return new KeySet[size];
        }
    };

    private static KeySet readFromParcel(Parcel in) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int describeContents() {
        return 0;
    }
}