package com.vodafone.es.marketplace.shippingorder.configuration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.vodafone.es.marketplace.shippingorder.configuration.codec.OffsetDateTimeCodec;
import org.bson.BsonType;
import org.bson.codecs.BsonTypeClassMap;
import org.bson.codecs.Codec;
import org.bson.codecs.DocumentCodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MongoClientConfig extends AbstractMongoClientConfiguration {

    @Value("${spring.data.mongodb.uri}")
    public String mongoUri;

    private String database = "shippingOrder";

    @Override
    public void configureClientSettings(MongoClientSettings.Builder builder) {
        CodecRegistry defaultCodecRegistry = MongoClient.getDefaultCodecRegistry();

        Map<BsonType, Class<?>> replacements = new HashMap<>();
        replacements.put(BsonType.DATE_TIME, OffsetDateTime.class);
        BsonTypeClassMap bsonTypeClassMap = new BsonTypeClassMap(replacements);
        DocumentCodecProvider documentCodecProvider = new DocumentCodecProvider(bsonTypeClassMap);

        Codec<OffsetDateTime> offsetDateTimeCodec = new OffsetDateTimeCodec();

        CodecRegistry codecRegistry = CodecRegistries.
                fromRegistries(CodecRegistries.fromCodecs(offsetDateTimeCodec),
                        CodecRegistries.fromProviders(documentCodecProvider),
                        defaultCodecRegistry);

        builder.codecRegistry(codecRegistry);
        builder.applyConnectionString(new ConnectionString(mongoUri));
    }

    @Override
    protected String getDatabaseName() {
        return database;
    }
}
