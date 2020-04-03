package de.heinze.iot_measurements.data.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Moritz Krischke
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class FluentObject {
    public static FluentObjectBuilder BUILDER(){
        return new FluentObjectBuilder();
    }

    @Id
    private String a;
    private String b;
    private String c;

    public static class FluentObjectBuilder {
        private String[] strings = new String[3];


        public FluentObjectBuilder a(String a){
            this.strings[0] = a;
            return this;
        }

        public FluentObjectBuilder b( String b){
            this.strings[1] = b;
            return this;
        }

        public FluentObjectBuilder c(String c){
            this.strings[2] = c;
            return this;
        }

        public FluentObject build(){
            return new FluentObject(strings[0],strings[1],strings[2]);
        }
    }

}
