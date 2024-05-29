package chapter03.creating_decision_making_statements.if_statement;

public class StatementsAndBlocks {

	public static void main(String[] args) {
		int patrons = 0;
		int ticketsTaken=2;

		//single Statement
		patrons++;

		//Statement inside a block
		{
			patrons++;
		}

		// Single statement
		if(ticketsTaken>1) {
			patrons++;
		}

		if(ticketsTaken>1) {
			patrons++;
		}


		System.out.println(patrons);

	}

}
