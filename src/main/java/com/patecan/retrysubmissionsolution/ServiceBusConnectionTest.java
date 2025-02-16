package com.patecan.retrysubmissionsolution;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationClient;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationClientBuilder;

public class ServiceBusConnectionTest {

    public static void main(String[] args) {
        // Update this to match your namespace hostname (no protocol or path)
        String namespace = "tranthientrongit-submission.servicebus.windows.net";


        // If using a connection string instead, do:
         ServiceBusAdministrationClient adminClient = new ServiceBusAdministrationClientBuilder()
            .connectionString("Endpoint=sb://tranthientrongit-submission.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=XwuGgN/BEt+gBwzjdeLrb5RtH5TS+3CVk+ASbK/H/Tw=")
            .buildClient();

        System.out.println("Attempting to list queues...");

        adminClient.listQueues().forEach(queue -> {
            System.out.println("Found queue: " + queue.getName());
        });

        System.out.println("Done.");
    }
}
