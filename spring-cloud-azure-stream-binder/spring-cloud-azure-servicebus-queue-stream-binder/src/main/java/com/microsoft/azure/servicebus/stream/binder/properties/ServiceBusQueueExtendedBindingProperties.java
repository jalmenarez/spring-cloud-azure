/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.servicebus.stream.binder.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Warren Zhu
 */
@ConfigurationProperties("spring.cloud.stream.servicebus.queue")
public class ServiceBusQueueExtendedBindingProperties extends ServiceBusExtendedBindingProperties {
    private static final String DEFAULTS_PREFIX = "spring.cloud.stream.servicebus.queue.default";

    @Override
    public String getDefaultsPrefix() {
        return DEFAULTS_PREFIX;
    }
}
