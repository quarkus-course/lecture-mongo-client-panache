package tech.donau.data;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import org.bson.codecs.pojo.annotations.BsonId;

@MongoEntity(collection = "books2")
public class Book extends PanacheMongoEntityBase {

    @BsonId
    public String title;
    public Integer pages;

}
