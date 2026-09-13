package Factory_02;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentProcessorFactory {

    private static final Map<String, Supplier<PaymentProcessor>> PROCESSORS =
            new HashMap<>();

    static {
        PROCESSORS.put("CREDIT_CARD", CreditCardProcessor::new);
        PROCESSORS.put("UPI", UpiProcessor::new);
        PROCESSORS.put("NET_BANKING", NetBankingProcessor::new);
    }

    public static PaymentProcessor getProcessor(String type) {

        if (type == null) {
            throw new IllegalArgumentException("Payment type cannot be null");
        }

        Supplier<PaymentProcessor> supplier =
                PROCESSORS.get(type.toUpperCase());

        if (supplier == null) {
            throw new IllegalArgumentException(
                    "Unsupported payment type: " + type
            );
        }

        return supplier.get();
    }

}
