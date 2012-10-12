PDFDIR=pdf
FIGDIR=fig

.SUFFIXES: .pdft

FIGURES =
PDFFIGURES= $(PDFDIR)/metamodelinghier.pdf \
	    $(PDFDIR)/code_generator.pdf\
	    $(PDFDIR)/VandV.pdf\




all:  ${PDFFIGURES} ${FIGURES}

$(PDFDIR)/%.pdf: $(FIGDIR)/%.fig
	fig2dev -L pdf  -m 0.45 -l 1 $(FIGDIR)/$*.fig $(PDFDIR)/$*.pdf
#$(PSTDIR)/%.pdf $(PSTDIR)/%.pdft: $(FIGDIR)/%.fig
#	fig2dev -L pdftex -m 0.45 -l 1 $(FIGDIR)/$*.fig $(PSTDIR)/$*.pdf
#	fig2dev -L pdftex_t -m 0.45 -l 1  -p $(PSTDIR)/$*.pdf $(FIGDIR)/$*.fig $(PSTDIR)/$*.pdft

.PHONY: clean

clean:
	cd pdftex ; rm -f *.pdf *.pdft 
