package happycows.actions;

import happycows.attributes.Position;
import happycows.entities.Grass;
import jalse.JALSE;
import jalse.actions.Action;
import jalse.actions.ActionContext;

public class SproutGrass implements Action<JALSE> {

    @Override
    public void perform(final ActionContext<JALSE> context) {
	final Grass grass = context.getOrNullActor().newEntity(Grass.class);
	grass.addAttributeOfType(Position.randomPosition());
	System.out.println(String.format("New grass has sprouted [%s]", grass.getID()));
    }
}
