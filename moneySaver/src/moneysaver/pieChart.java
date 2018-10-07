/*
 * Many people find their money spent easily and they even haven't realized how they spent the money.
 * This system is helping people to analyze how they spend money in different aspects.
 * It will show a pie chart to afford visualization of the analyzation.
 */
package moneysaver;

/**
 *
 * @author David
 */
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import java.util.*;

//Set up pie chart
public class pieChart extends Application {
    
    Scanner scan = new Scanner(System.in);
    functionImplement f = new functionImplement();

    @Override public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Money Spent on each aspect");
        stage.setWidth(500);
        stage.setHeight(500);

        //set variables and names of pie chart
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Daily supplies", f.daily()),
                new PieChart.Data("Cloths", f.cloth()),
                new PieChart.Data("Electronic supplies", f.electronic()),
                new PieChart.Data("Food", f.food()),
                new PieChart.Data("Luxury", f.luxury()),
                new PieChart.Data("Hang out", f.play()),
                new PieChart.Data("Snacks", f.snacks()),
                new PieChart.Data("Others", f.other()));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Money Spent");

        //bind data,name,value unit
        pieChartData.forEach(data ->
                data.nameProperty().bind(
                        Bindings.concat(
                                data.getName(), " ", "$", data.pieValueProperty()
                        )
                )
        );

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
        
        f.getBiggest();
        System.out.println("Suggestion: " + f.say);
        
    }

    //main function
    public static void main(String[] args) {
        
        System.out.println("\n***********Welcome to MoneySaver System!***********\n");
        System.out.println("****It helps analyzing how your spend money within a month!****\n");
        System.out.println("*Please enter how much you spent monthly on each aspect asked*\n");
        System.out.println("***************************************************");
        System.out.println("******************Analyze begins!******************\n");
        System.out.println("***************************************************");
        
        //build pie chart
        launch(args);
       
    }
}