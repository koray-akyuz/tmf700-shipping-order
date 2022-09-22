package com.vodafone.es.marketplace.shippingorder.configuration.codec;

import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class OffsetDateTimeCodec implements Codec<OffsetDateTime> {
    @Override
    public void encode(final BsonWriter writer, final OffsetDateTime value, final EncoderContext encoderContext) {
        writer.writeDateTime(value.toInstant().toEpochMilli());
    }

    @Override
    public OffsetDateTime decode(final BsonReader reader, final DecoderContext decoderContext) {
        if (reader.getCurrentBsonType().equals(BsonType.DATE_TIME)) {
            return OffsetDateTime.ofInstant(Instant.ofEpochMilli(reader.readDateTime()), ZoneId.systemDefault());
        }
        return OffsetDateTime.parse(reader.readString());
    }

    @Override
    public Class<OffsetDateTime> getEncoderClass() {
        return OffsetDateTime.class;
    }
}
