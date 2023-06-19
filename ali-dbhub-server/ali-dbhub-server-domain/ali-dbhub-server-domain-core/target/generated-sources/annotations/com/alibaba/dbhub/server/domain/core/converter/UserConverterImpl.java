package com.alibaba.dbhub.server.domain.core.converter;

import com.alibaba.dbhub.server.domain.api.model.User;
import com.alibaba.dbhub.server.domain.repository.entity.DbhubUserDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T10:48:12+0800",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class UserConverterImpl extends UserConverter {

    @Override
    public User do2dto(DbhubUserDO data) {
        if ( data == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( data.getEmail() );
        user.setId( data.getId() );
        user.setNickName( data.getNickName() );
        user.setPassword( data.getPassword() );
        user.setUserName( data.getUserName() );

        return user;
    }

    @Override
    public List<User> do2dto(List<DbhubUserDO> datas) {
        if ( datas == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( datas.size() );
        for ( DbhubUserDO dbhubUserDO : datas ) {
            list.add( do2dto( dbhubUserDO ) );
        }

        return list;
    }

    @Override
    public DbhubUserDO dto2do(User user) {
        if ( user == null ) {
            return null;
        }

        DbhubUserDO dbhubUserDO = new DbhubUserDO();

        dbhubUserDO.setEmail( user.getEmail() );
        dbhubUserDO.setId( user.getId() );
        dbhubUserDO.setNickName( user.getNickName() );
        dbhubUserDO.setPassword( user.getPassword() );
        dbhubUserDO.setUserName( user.getUserName() );

        return dbhubUserDO;
    }
}
