package com.alibaba.dbhub.server.web.api.controller.user.converter;

import com.alibaba.dbhub.server.domain.api.model.User;
import com.alibaba.dbhub.server.web.api.controller.user.request.UserCreateRequest;
import com.alibaba.dbhub.server.web.api.controller.user.request.UserUpdateRequest;
import com.alibaba.dbhub.server.web.api.controller.user.vo.UserVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T10:48:15+0800",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class UserWebConverterImpl extends UserWebConverter {

    @Override
    public UserVO dto2vo(User user) {
        if ( user == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setEmail( user.getEmail() );
        userVO.setId( user.getId() );
        userVO.setNickName( user.getNickName() );
        userVO.setPassword( user.getPassword() );
        userVO.setUserName( user.getUserName() );

        return userVO;
    }

    @Override
    public List<UserVO> dto2vo(List<User> user) {
        if ( user == null ) {
            return null;
        }

        List<UserVO> list = new ArrayList<UserVO>( user.size() );
        for ( User user1 : user ) {
            list.add( dto2vo( user1 ) );
        }

        return list;
    }

    @Override
    public User createRequest2dto(UserCreateRequest createRequest) {
        if ( createRequest == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( createRequest.getEmail() );
        user.setNickName( createRequest.getNickName() );
        user.setPassword( createRequest.getPassword() );
        user.setUserName( createRequest.getUserName() );

        return user;
    }

    @Override
    public User updateRequest2dto(UserUpdateRequest updateRequest) {
        if ( updateRequest == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( updateRequest.getEmail() );
        user.setId( updateRequest.getId() );
        user.setNickName( updateRequest.getNickName() );
        user.setPassword( updateRequest.getPassword() );
        user.setUserName( updateRequest.getUserName() );

        return user;
    }
}
