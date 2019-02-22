package homework.homework23.miners;

public class Barracks {

    private final String[] names = {"Amelia", "Olivia", "Emily", "Ava", "Isla", "Jessica", "Poppy", "Isabella", "Sophie", "Mia", "Ruby", "Lily", "Grace", "Evie", "Sophia", "Ella", "Scarlett", "Chloe", "Isabelle", "Freya", "Charlotte", "Sienna", "Daisy", "Phoebe", "Millie", "Eva", "Alice", "Lucy", "Florence", "Sofia", "Layla", "Lola", "Holly", "Imogen", "Molly", "Matilda", "Lilly", "Rosie", "Elizabeth", "Erin", "Maisie", "Lexi", "Ellie", "Hannah", "Evelyn", "Abigail", "Elsie", "Summer", "Megan", "Jasmine", "Maya", "Amelie", "Lacey", "Willow", "Emma", "Bella", "Eleanor", "Esme", "Eliza", "Georgia", "Harriet", "Gracie", "Annabelle", "Emilia", "Amber", "Ivy", "Brooke", "Rose", "Anna", "Zara", "Leah", "Mollie", "Martha", "Faith", "Hollie", "Amy", "Bethany", "Violet", "Katie", "Maryam", "Francesca", "Julia", "Maria", "Darcey", "Isabel", "Tilly", "Maddison", "Victoria", "Isobel", "Niamh", "Skye", "Madison", "Darcy", "Aisha", "Beatrice", "Sarah", "Zoe", "Paige", "Heidi", "Lydia", "Oliver", "Jack", "Harry", "Jacob", "Charlie", "Thomas", "Oscar", "William", "James", "George", "Alfie", "Joshua", "Noah", "Ethan", "Muhammad", "Archie", "Leo", "Henry", "Joseph", "Samuel", "Riley", "Daniel", "Mohammed", "Alexander", "Max", "Lucas", "Mason", "Logan", "Isaac", "Benjamin", "Dylan", "Jake", "Edward", "Finley", "Freddie", "Harrison", "Tyler", "Sebastian", "Zachary", "Adam", "Theo", "Jayden", "Arthur", "Toby", "Luke", "Lewis", "Matthew", "Harvey", "Harley", "David", "Ryan", "Tommy", "Michael", "Reuben", "Nathan", "Blake", "Mohammad", "Jenson", "Bobby", "Luca", "Charles", "Frankie", "Dexter", "Kai", "Alex", "Connor", "Liam", "Jamie", "Elijah", "Stanley", "Louie", "Jude", "Callum", "Hugo", "Leon", "Elliot", "Louis", "Theodore", "Gabriel", "Ollie", "Aaron", "Frederick", "Evan", "Elliott", "Owen", "Teddy", "Finlay", "Caleb", "Ibrahim", "Ronnie", "Felix", "Aiden", "Cameron", "Austin", "Kian", "Rory", "Seth", "Robert", "Albert", "Sonny"};
    private int counter = 0;

    public String generateName(){
        String name = names[(int)(Math.random()*names.length)] + "-"+ counter;
        counter++;
        return name;
    }




}
