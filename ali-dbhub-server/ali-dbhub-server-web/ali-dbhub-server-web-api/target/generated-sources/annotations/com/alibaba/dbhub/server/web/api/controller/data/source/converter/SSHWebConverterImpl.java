package com.alibaba.dbhub.server.web.api.controller.data.source.converter;

import com.alibaba.dbhub.server.domain.support.model.SSHInfo;
import com.alibaba.dbhub.server.web.api.controller.data.source.request.SSHTestRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T10:48:15+0800",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class SSHWebConverterImpl extends SSHWebConverter {

    @Override
    public SSHInfo toInfo(SSHTestRequest request) {
        if ( request == null ) {
            return null;
        }

        SSHInfo sSHInfo = new SSHInfo();

        sSHInfo.setAuthenticationType( request.getAuthenticationType() );
        sSHInfo.setHostName( request.getHostName() );
        sSHInfo.setKeyFile( request.getKeyFile() );
        sSHInfo.setLocalPort( request.getLocalPort() );
        sSHInfo.setPassphrase( request.getPassphrase() );
        sSHInfo.setPassword( request.getPassword() );
        sSHInfo.setPort( request.getPort() );
        sSHInfo.setUse( request.isUse() );
        sSHInfo.setUserName( request.getUserName() );

        return sSHInfo;
    }
}
