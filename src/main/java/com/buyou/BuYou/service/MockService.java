package com.buyou.BuYou.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

@Service
public class MockService {

    @Autowired
    private ObjectMapper objectMapper;

    public <T> T getMock(final TypeReference<T> type, final String jsonPath) throws IOException {
        T data = null;
        StringWriter writer = new StringWriter();
        InputStream inputStream = TypeReference.class.getClassLoader().getResourceAsStream(jsonPath);
        IOUtils.copy(inputStream, writer, "UTF-8");
        data = objectMapper.readValue(writer.toString(), type);
        return data;
    }

}
