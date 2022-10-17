/**
 * 
 */
package test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.function.ThrowingRunnable;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import model.Card;
import model.LinkedListStack;

/**
 * @author gurmangrewal
 *
 */
class LinkedListStackTest {
	
	LinkedListStack<Card> stack;
	
	@Test
	@DisplayName("is instantiated with new LinkedListStack()")
	void isInstantiatedWithNew() {
		new LinkedListStack<>();
	}

	@Nested
	@DisplayName("when new")
	class WhenNew {
		
		@BeforeEach
		void createNewStack() {
			stack = new LinkedListStack<Card>();
		}
		
		@Test
		@DisplayName ("is empty")
		void isEmpty() {
			assertTrue(stack.isEmpty());
		}
		
		@Test
		@DisplayName("throws EmptyStackException when popped")
		void throwsExceptionWhenPopped() {
			assertThrows(EmptyStackException.class, stack::pop);
		}
		
		@Test
		@DisplayName("throws EmptyStackException when peeked")
		void throwsExceptionWhenPeeked() {
			assertThrows(EmptyStackException.class, stack::peek);
		}
		
		@Nested
		@DisplayName("after pushing a card")
		class AfterPushing{
			
			
			Card aCard = new Card(1, "Diamond");
			
			@BeforeEach
			void pushAnElement() {
				stack.push(aCard);
			}
			
			@Test
			@DisplayName("returns the element when popped and is empty")
			void returnElementWhenPopped() {
				assertEquals(aCard, stack.pop());
				assertTrue(stack.isEmpty());
			}
			
			@Test
			@DisplayName("returns the element when peeked but remains not empty")
			void returnElementWhenPeeked() {
				assertEquals(aCard, stack.peek());
				assertFalse(stack.isEmpty());
			}
		}
	}
}
