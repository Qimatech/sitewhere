/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.microservice.grpc;

import com.sitewhere.spi.server.lifecycle.ILifecycleComponent;

/**
 * Binds to a port and listens for microservice management GRPC requests.
 * 
 * @author Derek
 */
public interface IMicroserviceManagementGrpcServer extends ILifecycleComponent {
}