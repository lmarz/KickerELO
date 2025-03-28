package org.kickerelo.kickerelo.layout;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.Layout;
import org.kickerelo.kickerelo.views.*;

@Layout
@JsModule("prefers-color-scheme.js")
public class KickerAppLayout extends AppLayout {

    public KickerAppLayout() {
        DrawerToggle drawerToggle = new DrawerToggle();

        H1 title = new H1("Kicker-ELO");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)").set("margin", "0");

        addToNavbar(drawerToggle, title);

        SideNav general = new SideNav("Allgemein");
        general.setCollapsible(true);
        general.addItem(new SideNavItem("Spielerliste", PlayerListView.class, VaadinIcon.GROUP.create()),
                new SideNavItem("Verwaltung", AdminView.class, VaadinIcon.COG.create()));
        SideNav nav1 = new SideNav("1 vs 1");
        nav1.setCollapsible(true);
        nav1.addItem(new SideNavItem("Ergebnis eintragen",  Enter1vs1View.class, VaadinIcon.EDIT.create()),
                new SideNavItem("ELO-Graph",  Graph1vs1View.class, VaadinIcon.BAR_CHART.create()),
                new SideNavItem("Historie", History1vs1View.class, VaadinIcon.RECORDS.create()));
        SideNav nav2 = new SideNav("2 vs 2");
        nav2.setCollapsible(true);
        nav2.addItem(new SideNavItem("Ergebnis eintragen", Enter2vs2View.class, VaadinIcon.EDIT.create()),
                new SideNavItem("ELO-Graph", Graph2vs2View.class, VaadinIcon.BAR_CHART.create()),
                new SideNavItem("Historie", History2vs2View.class, VaadinIcon.RECORDS.create()));


        Image githubLogo = new Image("github-mark.png", "Github");
        githubLogo.setHeight("30px");
        Anchor gitLink = new Anchor("https://github.com/AJMicke/KickerELO", githubLogo);
        Div spacingDiv = new Div(gitLink);
        spacingDiv.setSizeFull();
        gitLink.setTarget("_blank");
        gitLink.getElement().getStyle().set("background-color", "transparent");
        Div gitLinkDiv = new Div(gitLink);
        gitLinkDiv.getStyle().setAlignSelf(Style.AlignSelf.END).setMarginRight("5px");
        addToDrawer(general, nav1, nav2, spacingDiv, gitLinkDiv);
    }
}
