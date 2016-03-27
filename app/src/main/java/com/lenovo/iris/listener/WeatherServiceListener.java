
package com.lenovo.iris.listener;

import com.lenovo.iris.data.Channel;

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
