package com.message.swift;

import com.message.swift.domain.Message;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends R2dbcRepository<Message,String> {
}
