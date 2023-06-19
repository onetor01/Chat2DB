package com.alibaba.dbhub.server.web.api.controller.ai.converter;

import com.alibaba.dbhub.server.domain.api.param.TableQueryParam;
import com.alibaba.dbhub.server.web.api.controller.ai.request.ChatQueryRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T10:48:15+0800",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class ChatConverterImpl extends ChatConverter {

    @Override
    public TableQueryParam chat2tableQuery(ChatQueryRequest request) {
        if ( request == null ) {
            return null;
        }

        TableQueryParam tableQueryParam = new TableQueryParam();

        tableQueryParam.setDataSourceId( request.getDataSourceId() );
        tableQueryParam.setDatabaseName( request.getDatabaseName() );
        tableQueryParam.setSchemaName( request.getSchemaName() );

        return tableQueryParam;
    }
}
