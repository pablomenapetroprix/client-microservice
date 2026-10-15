package com.wipay.client.model.entity;

import com.wipay.dynamodb.entity.MainTable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@DynamoDbBean
@NoArgsConstructor
@Getter
@Setter
public class ClientEntity extends MainTable {

    private String name;
    private String surname;
    private String cifNifNie;
    private String phone;
    private String email;
}
