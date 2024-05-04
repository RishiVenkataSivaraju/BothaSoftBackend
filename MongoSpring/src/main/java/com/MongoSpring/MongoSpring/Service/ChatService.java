package com.MongoSpring.MongoSpring.Service;
import ai.djl.Model;
import ai.djl.inference.Predictor;
import ai.djl.modality.Classifications;
import ai.djl.modality.Input;
import ai.djl.modality.Output;
//import ai.djl.modality.nlp.qa.;
import ai.djl.modality.nlp.qa.QAInput;
//import ai.djl.modality.nlp.qa.QAOutput;
//import ai.djl.modality.nlp.qa.QaModel;
//import ai.djl.modality.nlp.qa.QaModelLoader;
import ai.djl.translate.TranslateException;
import java.io.IOException;

public class ChatService {

    private Model model;

    public ChatService() throws IOException {
        // Load the model
        model = Model.newInstance("path/to/your/model", "cpu");
    }
//
//    public String generateResponse(String question) {
//        try (Predictor<QAInput, QAOutput> predictor = model.newPredictor()) {
//            // Prepare the input
//            QAInput input = new QAInput(question, "");
//
//            // Generate the response
//            QAOutput output = predictor.predict(input);
//
//            // Return the answer
//            return output.getAnswer();
//        } catch (TranslateException e) {
//            throw new RuntimeException("Failed to generate response", e);
//        }
//    }
}
