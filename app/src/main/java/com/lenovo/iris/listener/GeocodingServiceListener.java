
package com.lenovo.iris.listener;

import com.lenovo.iris.data.LocationResult;

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}
