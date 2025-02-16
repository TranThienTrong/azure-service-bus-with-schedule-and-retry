package com.patecan.retrysubmissionsolution.service.message;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.function.Supplier;
import java.util.function.Consumer;

@Service
public class StreamService {

    @Bean
    public Supplier<String> produce1() {  // Sends to topicA
        return () -> "Message from produce1";
    }

    @Bean
    public Supplier<String> produce2() {  // Sends to topicB
        return () -> "Message from produce2";
    }

    @Bean
    public Consumer<String> consume1() {  // Reads from topicA
        return message -> System.out.println("consume1 received: " + message);
    }

    @Bean
    public Consumer<String> consume2() {  // Reads from topicB
        return message -> System.out.println("consume2 received: " + message);
    }
}

