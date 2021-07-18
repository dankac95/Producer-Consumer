package zdanie3;

import com.google.gson.Gson;
import zdanie3.model.JobOffer;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private final BlockingQueue<JobOffer> offersQueue;

    public Producer(BlockingQueue<JobOffer> offersQueue) {
        this.offersQueue = offersQueue;
    }

    @Override
    public void run() {
        // TODO: Sprawdz ktory portal udostepnia dane ofert pracy w postaci JSON (NFJ, JJIT, F12 w przegladarce, zakladka Network)
        // TODO: Napisz kod ktory z tego znalezionego JSONa wyluska oferty pracy.
        // Najlepiej napisz sobie klase (na sutrukture danych oferty pracy i do niej pobieraj dane z JSONa)
        // Prawdopodobnie bedzie potrzebne przeniesienie calego kodu testu do nowego projektu (Mavenowego, zaden Spring nie bedze potrzebny)
        // Bedziesz potrzebowal bibloteki do obslugi JSONa (1. sam parser JSONa, Np Jackson lub GSON, 2. uzyc gotowego klienta REST API, np. Feign lub Retrofit lub REstTemplate)

        try {
            URL url = new URL("https://justjoin.it/api/offers");
            InputStreamReader reader = new InputStreamReader(url.openStream());
            JobOffer[] jobOffer = new Gson().fromJson(reader, JobOffer[].class);
            offersQueue.addAll(Arrays.asList(jobOffer));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
